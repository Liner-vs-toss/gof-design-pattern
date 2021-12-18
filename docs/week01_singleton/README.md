# 01. Singleton Pattern 
## singleton pattern 의 목적
- 인스턴스를 반드시 1개만 만들어야할 경우
- 그리고 해당 인스턴스에 글로벌하게 접근이 가능해야할 경우 

## singleton pattern 을 구현하는 법 

### 방법 1. private constructor
private 생성자를 통해서 클래스 내부에서 인스턴스를 만들고 외부에서 이 인스턴스에 접근할 수 있는 함수를 따로 만들어준다. 
~~~kotlin
class SingletonPatternWithPrivateConstructor3 private constructor(){

    companion object {
        private lateinit var INSTANCE : SingletonPatternWithPrivateConstructor3

        fun getInstance(): SingletonPatternWithPrivateConstructor3 {
            if(INSTANCE == null){
                INSTANCE = SingletonPatternWithPrivateConstructor3()
            }
            return INSTANCE
        }
    }
}
~~~
- 장점 : 간단하게 singleton을 구현할 수 있다 
- 단점 : 멀티 쓰레드 환경에서 safe 하지 않음


### 방법 2. private constructor with multi-thread safe (1)
~~~kotlin
class SingletonPatternWithPrivateConstructor private constructor(){

    companion object {
        private val INSTANCE = SingletonPatternWithPrivateConstructor()

        fun getInstance(): SingletonPatternWithPrivateConstructor {
            return INSTANCE
        }
    }
}
~~~
- 장점 : 멀티 쓰레드 환경에서 safe
- 단점 : getInstance를 사용하지 않더라도 INSTANCE가 만들어진다. 

### 방법 3. private constructor with multi-thread safe (2)
~~~kotlin
object SingletonPatternWithObject {

}
~~~
- 장점 : 멀티 쓰레드 환경에서 safe
- 단점 : synchronized를 사용함. 


### 방법 4. double checked locking 
~~~kotlin
class SingletonPatternDoubleCheckedLocking private constructor() {

    companion object {

        @Volatile
        private var INSTANCE: SingletonPatternDoubleCheckedLocking? = null

        fun getInstance(): SingletonPatternDoubleCheckedLocking =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: SingletonPatternDoubleCheckedLocking().also { INSTANCE = it }
            }
    }
}
~~~
synchronized를 getInstance시 마다 부르는게 아니라 INSTANCE가 비어있을때만 부른다. 
- 장점 : 멀티 쓰레드 환경에서 safe

* volatile 을 쓰는 이유 
메모리는 메인 메모리와 쓰레드마다 가지고 있는 메모리가 있는데, volatile을 쓰지 않게 되면 쓰레드 메모리에 저장되있고 이 데이터가 메인 메모리로 옮겨지는데
타임갭이 생기므로 문제가 발생할 수 있다. 따라서 이를 막기 위해 volatile을 붙여서 읽는 것은 반드시 메인 메모리에서 읽어오도록 한다.  

### 방법 5. Lazy loading
~~~kotlin
class SingletonPatternLazy private constructor(){
    companion object {
        private val SingletonPatternLazyInstance: SingletonPatternLazy by lazy { SingletonPatternLazy() }

        fun getInstance(): SingletonPatternLazy {
            return SingletonPatternLazy.SingletonPatternLazyInstance
        }
    }
}
~~~
장점 : Lazy하게 loading 가능 
 
## Singleton 깨트리기 
### Reflection
~~~kotlin
fun main() {
    // val instance1 = SingletonPatternWithPrivateConstructor()
    val instance1 = SingletonPatternWithPrivateConstructor.getInstance()
    val clazz = Class.forName("com.example.gofdesignpattern.week01_singleton.SingletonPatternWithPrivateConstructor").kotlin.objectInstance

    println(instance1 == clazz) // false
}
~~~
#### 막는 방법 
enum을 사용한다.

### 직렬화와 역직렬화
객체를 파일로 쓰고 역직렬화를 할땐 객체가 달라짐. 

#### 막는 방법 
역직렬화시 readResolve라는 함수를 통해 인스턴스를 가지고 오므로 여기서 지정된 instance를 돌려주도록 한다.

# 과제
싱글톤패턴을 구현하는 여러가지 방법중 하나를 이용하여 구현하기.
싱글톤패턴을 구현하고, 이를 깨는 방법을 하나 선택하여 구현하기. 


#### 참고 
- https://bonoogi.postype.com/post/3591846
