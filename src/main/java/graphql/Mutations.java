package graphql;



import com.coxautodev.graphql.tools.GraphQLRootResolver;
import repository.ModuleBusiness;

public class Mutations implements GraphQLRootResolver {
    private static ModuleBusiness mb;
    public Mutations(ModuleBusiness mb) {
        this.mb = mb;
    }


    public Boolean deleteModule( String matr){
        return mb.deleteModule(matr);
    }
    }
