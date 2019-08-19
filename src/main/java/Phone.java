
class Phone {

  private  double weight;  //Instance variables that store the state of an object of Phone
    public void setWeight(double val) {
        if (val >= 0 && val <= 1000){
            weight = val;
        }
    }
    public double getWeight(){
        return weight;
    }
}

