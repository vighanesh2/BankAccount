import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class File{
    public Long[ ] readFile(String filename) throws IOException, BadDataException{
    FileReader reader = new FileReader(filename);
    try{
        Scanner in = new Scanner(reader);
        readData(in);
    }
    
finally{
        reader.close();
    }
    return data;
}
    private void readData(Scanner in) throws BadDataException{
        if(!in.hasNextLong()) throw new BadDataException("Number of Accounts Expected");
        int numberOfValues = in.nextInt();
        data = new Long[numberOfValues];

        for(int i = 0; i < numberOfValues; i++)
            readValue(in, i);

if(in.hasNext())
        throw new BadDataException("End of file expected");
}

    private void readValue(Scanner in, int i) throws BadDataException{
    
    if(!in.hasNextLong()) throw new BadDataException("Account number and PIN expected");
    data[ i ] = in.nextLong();
    }
    private Long [ ] data;
}
    
