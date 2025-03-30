public class Engine {
    private int NoOfPiston;
    private String Power;
    private String type;

    public int getNoOfPiston(){
        return NoOfPiston;
    }
    public void setNoOfPiston(int NoOfPiston){
        this.NoOfPiston=NoOfPiston;
    }
    public String getPower(){
        return Power;
    }
    public void setPower(String Power){
        this.Power=Power;
    }
    public String gettype(){
        return type;
    }
    public void settype(String type){
        this.type=type;
    }

    public Engine(int NoOfPiston,String Power,String type){
        this.NoOfPiston=NoOfPiston;
        this.Power=Power;
        this.type=type;
    }
}
