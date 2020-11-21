public class SameIntegerException extends Exception{

    String msg;

    public SameIntegerException(String msg) {
        this.msg=msg;

    }

//    void SameIntegerException(String msg){
//        this.msg=msg;
//    }
    @Override
    public String getMessage(){
        return msg;
    }
}
