package Documents;

public abstract class Register {

//    private String docType;
//    private int docNumber;
//    private Date docDate;

//
//    //Constructor by default
//    public Register() {
//        docType = "Unknown";
//        docNumber = 0;
//        docDate = null;

//
//    //Constructor with parameters
//    public Register(String docType, int docNumber, Date docDate) {
//        this.docType = docType;
//        this.docNumber = docNumber;
//        this.docDate = docDate;
//
//
//        //Getters
//           public String getdocType(){
//               return docType;
//            }


            //What about getters ?????????????????????????????????????????



//Array, which contains all documents in register
    IFDocument [] documents = new IFDocument[10];

    //Method for saving a document in register
    public void saveDocument(IFDocument documents) {


    }


    //Method for giving info about document
    public String giveDocInfo(int docNumber);


}

    private void getdocType() {
    }