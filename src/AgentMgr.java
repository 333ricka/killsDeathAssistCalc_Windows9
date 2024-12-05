import java.io.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


//saving info into files
public class AgentMgr {
@Override
    public void agentStorage(Agent) throws IOException
    {
        try
        {
            FileOutputStream fileOutputStream =
                    new FileOutputStream(AgentMgr);
            ObjectOutputStream objectOutputStream =
                    new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writerObject(game);
            objectOutputStream.close();
        } catch (IOException e){
            throw new IOException("Unable to access agent data");
        }
    }

    @Override
    public Agent getAgentMgr() throws IOException
    {
    FileInputStream fileInputStream =
            new FileInputStream(AgentMgr);
    ObjectInputStream objectInputStream =
            new ObjectInputStream(fileInputStream);
       try  {

        }
    }
}
