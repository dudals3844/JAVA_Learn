package project;

class A {
    
    public String y(){
        return "public void y()";
    }
    
    private String z(){
        return "private voud z()";
    }
    
    public String x(){
        return z();
    }
}