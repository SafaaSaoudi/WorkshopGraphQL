package graphql;

import com.coxautodev.graphql.tools.GraphQLRootResolver;
import entities.Module;
import entities.UniteEnseignement;
import repository.ModuleBusiness;
import repository.UniteEnseignementBusiness;

import java.util.List;


public class Query implements GraphQLRootResolver {


    private static ModuleBusiness mb;


    public Query(ModuleBusiness mb ) {
        this.mb = mb;
    }

    public List<Module> getallmodules() {
        return mb.getAllModules();
    }

}