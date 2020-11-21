public class OddException extends Exception{
    String msg;

    public OddException(String odd){
       // super(odd);
        this.msg=odd;
    }
    @Override
    public String getMessage(){
        return msg;
    }

}
