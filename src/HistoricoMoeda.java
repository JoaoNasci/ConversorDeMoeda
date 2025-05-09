import java.util.ArrayList;
import java.util.List;

public class HistoricoMoeda {
   private List<Moeda> moedaList = new ArrayList<>();



   public void addMoedas(Moeda moeda){
       moedaList.add(moeda);
   }
   public void historioco(){
      for (Moeda e : moedaList){
          System.out.println(e);
      }
   }

}
