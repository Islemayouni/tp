class test {
    public static void main(String[] args) {

        ex1 n1=new ex1( 123, "Islem", 17.5F);
        System.out.println("L'etudiant d'id " + n1.getMyId() +" s'appelle "+n1.getMyName()+" obtient la moyenne "+n1.getMyMoyen());


         
        group groupe1=new group("TIC-G1");
        System.out.println(groupe1.toString());
    }
}
