package generic;

public class Calculator<E> {
    private StringBuilder expression;
    public Calculator(){
        expression = new StringBuilder();
    }
    public void add(E e){
        expression.append("+"+e.toString());
    }
    public void minus(E e){
        expression.append("-"+e.toString());
    }
    public String expression(){
        if(expression.charAt(0) == '+'){
            return expression.substring(1);
        }else{
            return expression.toString();
        }
    }
}
