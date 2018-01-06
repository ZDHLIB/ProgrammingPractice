package DesignPattern.ChainOfResponsibility;

public class CommonManager extends Manager {

    public CommonManager(String name){
        super(name);
    }

    @Override
    public void requestApp(Request request) throws IllegalAccessException{
        if(request == null){
            throw new NullPointerException("Request is null!");
        }
        if(request.getReqType().equals("Leave") && request.getNum() < 2){
            System.out.println("CommonManager handles it!");
        }else{
            this.superior.requestApp(request);
        }
    }
}
