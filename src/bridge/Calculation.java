package bridge;

import composite.Regions;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.UUID;

public class Calculation implements APICalculationInterface {

    protected LinkedHashMap<String, String> content = new LinkedHashMap<>();

    @Override
    public float Calculo(Regions regiao) {
        ArrayList<Regions> regioes = new ArrayList<>();
        float rentabilidade = 0;
        float valor_economizado = 0, total_investido = 0;

        for (int i = 0; i <= regioes.size(); i++) {
            rentabilidade += valor_economizado / total_investido * 100;
        }
        return rentabilidade;
    }

    @Override
    public String getContent(String contentId) {
        if(contentId.equals("0")){
            String all = "";
            for(String key: content.keySet())
                all += content.get(key);
            return all;
        }
        return this.content.get(contentId);
    }

    @Override
    public String setContent(String content) {
        String id = UUID.randomUUID().toString();
        this.content.put(id, content);
        return id;
    }
}
