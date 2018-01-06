package DesignPattern.ChainOfResponsibility;

public class GeneralManager extends Manager {
    public GeneralManager(String name){
        super(name);
    }

    @Override
    public void requestApp(Request request) throws IllegalAccessException {
        if(request == null){
            throw new NullPointerException("Request is null!");
        }
        if(request.getReqType().equals("Leave") && request.getNum() >= 5){
            System.out.println("GeneralManager handles it!");
        }else{
            throw new IllegalAccessException("Illegal request");
        }
    }
}
