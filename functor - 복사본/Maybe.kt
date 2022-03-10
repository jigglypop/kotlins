sealed class Maybe<out A> : Functor<A> {
    abstract override fun toString() : String
    abstract override fun <B> fmap(f: (A) -> B): Maybe<B>
}

data class Just<out A>

fun main() {
    print("Hello")
}