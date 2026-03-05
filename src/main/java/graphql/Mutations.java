package graphql;


import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLRootResolver;
import entities.UniteEnseignement;
import entities.Module;
import repository.ModuleBusiness;
import repository.UniteEnseignementBusiness;

public class Mutations implements GraphQLRootResolver {

    private static UniteEnseignementBusiness ueb;
    private static ModuleBusiness mb;
    public Mutations(UniteEnseignementBusiness ueb, ModuleBusiness mb) {
        this.ueb = ueb;
        this.mb = mb;
    }

    public Boolean deleteUE(int code){
        return ueb.deleteUniteEnseignement(code);
    }

    public Module addModule(String matricule, String nom, int coefficient, int volumeHoraire, entities.Module.TypeModule type, int codeUE){


        UniteEnseignement ue = ueb.getUEByCode(codeUE);
       Module m = new Module(matricule,  nom,  coefficient,  volumeHoraire,  type,  ue);
        mb.addModule(m);
        return m;
    }


    }
