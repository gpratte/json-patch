import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonpatch.JsonPatch;
import com.github.fge.jsonpatch.JsonPatchException;

import java.io.IOException;

public class App {

    public String getPatched(String inputPatch, Object objToPatch) throws IOException, JsonPatchException {
        ObjectMapper mapper = new ObjectMapper();
        JsonPatch patch = mapper.readValue(inputPatch, JsonPatch.class);

        JsonNode node = mapper.convertValue(objToPatch, JsonNode.class);

        JsonNode patched = patch.apply(node);
        objToPatch = mapper.convertValue(patched, objToPatch.getClass());
        return mapper.writeValueAsString(objToPatch);
    }

}
