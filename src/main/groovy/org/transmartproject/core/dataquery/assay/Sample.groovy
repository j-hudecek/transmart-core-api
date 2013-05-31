package org.transmartproject.core.dataquery.assay

import org.transmartproject.core.dataquery.Patient
import org.transmartproject.core.dataquery.Platform

/**
 * An sample is any biological tissue used in an analysis for generating
 * high-dimensional data. A sample is linked to a specific patient and has
 * a certain sample and/or tissue type.
 */
interface Sample {

    /**
     * A numeric identifier for this sample.
     */
    Long getId()

    /**
     * The patient from whom a sample was extracted for this assay.
     *
     * @return the patient for this assay; never null
     */
    Patient getPatient()

    /**
     * The trial for which this assay was done. An all-uppercase name.
     *
     * @return The all-uppercase trial name; never null
     */
    String getTrialName()

    /**
     * The timepoint at which this assay was conducted. May be null.
     *
     * @return the nullable assay timepoint
     */
    Timepoint getTimepoint()

    /**
     * The sample type associated with this assay.
     *
     * @return the sample used in this assay or null if not available
     */
    SampleType getSampleType()

    /**
     * The tissue type associated with this assay.
     *
     * @return the tisue type, if any; null otherwise
     */
    TissueType getTissueType()

}
