package services;

public class RunApp {
//    CRDOperations crdOperations = new CRDOperations();

    public static void main(String[] args) {
        CRDOperations crdOperations = new CRDOperations();
//        crdOperations.insertEntity();
//        crdOperations.findEntity();
//        crdOperations.updateEntity();
//        crdOperations.removeEntity();
        crdOperations.findAll();
    }
}
