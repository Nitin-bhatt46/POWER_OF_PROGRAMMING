
class tri_num   {
    public static void main(String[] args) {
        for(int i =1;i<=7;++i){
            for(int j =1;j<=i;++j){
                if(j>6) continue;
                System.out.print(j+" " );
            }
            System.out.println("");
        }
    }
}
