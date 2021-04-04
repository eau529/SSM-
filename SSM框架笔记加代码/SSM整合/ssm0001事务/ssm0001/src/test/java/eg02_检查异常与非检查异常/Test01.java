package eg02_检查异常与非检查异常;


import java.io.IOException;

class A{
    protected Object f1(int a) throws Exception{
        if(true){
            throw new Exception("") ;
        }

        return 1 ;
    }

    public void f2() {
        if(true){
            throw new RuntimeException("") ;
        }
    }

    public void f3() {
        if(true){
            throw new Error("") ;
        }
    }
}

class B extends A{
    @Override
    public Integer f1(int b) throws IOException {
        if(true){
            throw new IOException("") ;
        }
        return 1 ;
    }
}

class C extends A{
    @Override
    public Integer f1(int b) throws  Error{
        if(true){
            throw new Error("") ;
        }
        return 1 ;
    }
}
public class Test01 {
    public void test01(){

    }
}
