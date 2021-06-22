public class BookAdapter extends Book{
    private IncompatibleBook aString = new IncompatibleBook();
    public void setTitleString(String aString){
        this.aString.setTitle(aString);
    }
    public String getTitleString(){
        return this.aString.getTitle();
    }
}