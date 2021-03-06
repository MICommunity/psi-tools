package psidev.psi.tools.ontology_manager.impl.local;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import psidev.psi.tools.ontology_manager.interfaces.OntologyAccess;
import psidev.psi.tools.ontology_manager.interfaces.OntologyTermI;

import java.io.File;

/**
 * Access to a local ontology in the form of an OBO file.
 *
 * NOTE : the LocalOntology class is now extending AbstractLocalOntology. Nothing has changed in the methods of this class which is still using OntologyTermI, Ontology and OboLoader.
 * As we needed some flexibility when using different extension of the basic OntologyTermI, we created a template for LocalOntology and for retrocompatibility,
 * this class has been kept and extends AbstractLocalOntology<OntologyTermI, Ontology, OboLoader>.
 *
 * @author Florian Reisinger
 * @author Samuel Kerrien (skerrien@ebi.ac.uk)
 * @since 2.0.0
 */
public class LocalOntology extends AbstractLocalOntology<OntologyTermI, Ontology, OboLoader> implements OntologyAccess {

    public static final Log log = LogFactory.getLog( LocalOntology.class );

    public LocalOntology() {
        super();
    }

    @Override
    protected OboLoader createNewOBOLoader(File ontologyDirectory) throws OntologyLoaderException {
        return new OboLoader( ontologyDirectory );
    }

}