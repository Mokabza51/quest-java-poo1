public class Wilder {

  private String firstname;
  private boolean aware;

  public Wilder (String firstname, boolean aware) {
    this.firstname = firstname;
    this.aware = aware;
  }

  public String getFirstname () {
    return this.firstname;
  }

  public void setFirstname (String firstname) {
    this.firstname = firstname;
  }

  public boolean isaware(){
    return this.aware;
  }

  public void setIsaware (boolean aware) {
    this.aware = aware;
  }

  public String whoAmI(){
	if(this.aware){
	return ("Je m'appelle " + this.firstname + " et je suis aware");
	}
	else{
	return ("Je m'appelle " + this.firstname + " et je ne suis pas aware");
	}
}

}
