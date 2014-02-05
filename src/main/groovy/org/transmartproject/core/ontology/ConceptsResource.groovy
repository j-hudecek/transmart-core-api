package org.transmartproject.core.ontology

import org.transmartproject.core.exceptions.NoSuchResourceException

/**
 * The ConceptsResource represent i2b2 concepts, that is,
 * classes of data. These concepts are organized in a hierarchical fashion.
 */
interface ConceptsResource {

    /**
     * Categories are concepts that group data for which there is a common
     * rule or rules for queries.
     *
     * @return the (possibly hidden or synonymous) categories
     */
    List<OntologyTerm> getAllCategories()

    /**
     * Returns the first non-synonym concept with the given key.
     *
     * @param conceptKey string in the form \\<table code><full name>
     * @return the requested concept
     * @throws NoSuchResourceException
     */
    OntologyTerm getByKey(String conceptKey) throws NoSuchResourceException

    /**
     * Returns all concepts that are marked as a study.
     *
     * @return the list of concept studies
     */
    List<OntologyTerm> getAllStudies()

    /**
     * Returns a single concept for the given id.
     *
     * @return the concept study
     */
    OntologyTerm getStudy(String studyId)

    /**
     * Returns all patient dimension objects (patients/subjects).
     *
     * @return the list of patients for a given study
     */
    List<PatientDimension> getSubjectsForStudy(I2b2 study)

    /**
     * Return the single study object for a given id
     */
    PatientDimension getSubjectForStudy(Integer subjectId) {
}
