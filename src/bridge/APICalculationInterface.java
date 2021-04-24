package bridge;

import composite.Regions;

public interface APICalculationInterface {
    float Calculo(Regions regiao);
    String getContent(String contentId);
    String setContent(String content);
}
