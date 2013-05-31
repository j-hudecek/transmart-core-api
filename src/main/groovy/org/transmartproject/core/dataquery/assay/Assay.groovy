package org.transmartproject.core.dataquery.assay

import org.transmartproject.core.dataquery.Patient
import org.transmartproject.core.dataquery.Platform

/**
 * An assay (used somewhat interchangeably with the term "sample" for tranSMART
 * purposes) is any biological tissue used in an analysis for generating
 * high-dimensional data. An assay is linked to a specific patient and to a
 * specific platform.
 */
interface Assay {

    /**
     * A numeric identifier for this assay.
     */
    Long getId()

    /**
     * The sample(s) on which this assay was performed.
     *
     * @return the patient for this assay; never null
     */
    Collection<Sample> getSamples()

    /**
     * The trial for which this assay was done. An all-uppercase name.
     *
     * @return The all-uppercase trial name; never null
     */
    String getTrialName()

    /**
     * The platform for this assay. A platform defines metadata about the
     * high-dimensional data. It can, for instance, refer to the commercial
     * array used to analyse the sample.
     *
     * @return the platform for this assay; never null
     */
    Platform getPlatform()

}
