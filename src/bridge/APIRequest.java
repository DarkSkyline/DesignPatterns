package bridge;

import javax.management.ServiceNotFoundException;
import java.util.HashMap;
import java.util.UUID;

public class APIRequest extends Object{

    protected HashMap<String, APICalculationInterface> services = new HashMap<>();

    public APIRequest() {}

    public String addService(APICalculationInterface service){
        String id = UUID.randomUUID().toString();
        this.services.put(id, service);
        System.out.println("Service added with id: {"+ id +"}");
        return id;
    }

    public String getContent(String serviceId, String contentId) throws ServiceNotFoundException {
        if (this.services.containsKey(serviceId)) {
            return this.services.get(serviceId).getContent(contentId);
        }
        throw new ServiceNotFoundException();
    }

    public String setContent(String serviceId, String content) throws ServiceNotFoundException {
        if(this.services.containsKey(serviceId)){
            return this.services.get(serviceId).setContent(content);
        }
        throw new ServiceNotFoundException();
    }
}
