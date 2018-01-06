package DesignPattern.ChainOfResponsibility;

public class Majordomo extends Manager {
    public Majordomo(String name){
        super(name);
    }

    @Override
    public void requestApp(Request request) throws IllegalAccessException{
        if(request == null){
            throw new NullPointerException("Request is null!");
        }
        if(request.getReqType().equals("Leave") && request.getNum() >= 2 && request.getNum() < 5){
            System.out.println("Majordomo handles it!");
        }else{
            this.superior.requestApp(request);
        }
    }
}
