package tw.com.ehanlin;

import com.mongodb.client.MongoClient;
import org.bson.Document;

import static com.mongodb.client.model.Filters.eq;

public class Library {

    private MongoClient client;

    public Library(MongoClient client) {
        this.client = client;
    }

    public Document findOne(String id) {
        return client
                .getDatabase("ehanlin")
                .getCollection("items")
                .find(eq("_id", id))
                .first();
    }
}
