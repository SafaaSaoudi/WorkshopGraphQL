package graphql;

import com.coxautodev.graphql.tools.GraphQLRootResolver;
import entities.Module;
import entities.UniteEnseignement;
import repository.ModuleBusiness;
import repository.UniteEnseignementBusiness;

import java.util.List;


public class Query implements GraphQLRootResolver {
    private ModuleBusiness mb;
    private UniteEnseignementBusiness ueb;

    public Query(ModuleBusiness mb) {
        this.mb = mb;
    }

    public List<Module> getallmodules() {

        return mb.getAllModules();
    }

}