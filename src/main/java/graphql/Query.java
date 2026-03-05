package graphql;

import com.coxautodev.graphql.tools.GraphQLRootResolver;
import entities.Module;
import entities.UniteEnseignement;
import repository.ModuleBusiness;
import repository.UniteEnseignementBusiness;

import java.util.List;


public class Query implements GraphQLRootResolver {


    private static ModuleBusiness mb;
    private static UniteEnseignementBusiness ueb;

    public Query(ModuleBusiness mb,  UniteEnseignementBusiness ueb) {
        this.mb = mb;
        this.ueb = ueb;
    }

    public List<Module> getallmodules() {
        return mb.getAllModules();
    }

    public List<Module> getmodulesByType(Module.TypeModule type) {
        return mb.getModulesByType(type);
    }

    public List<UniteEnseignement> getAllUE(){
        return  ueb.getListeUE();
    }

}