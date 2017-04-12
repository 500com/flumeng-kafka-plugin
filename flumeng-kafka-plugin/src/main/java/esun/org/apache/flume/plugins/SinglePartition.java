/*
 *  Copyright (c) 2013.09.06 BeyondJ2EE.
 *  * All right reserved.
 *  * http://beyondj2ee.github.com
 *  * This software is the confidential and proprietary information of BeyondJ2EE
 *  * , Inc. You shall not disclose such Confidential Information and
 *  * shall use it only in accordance with the terms of the license agreement
 *  * you entered into with BeyondJ2EE.
 *  *
 *  * Revision History
 *  * Author              Date                  Description
 *  * ===============    ================       ======================================
 *  *  beyondj2ee
 *
 */

package esun.org.apache.flume.plugins;

/**
 * Kafka Simple Partitioner.
 * User: beyondj2ee
 * Date: 13. 9. 4
 * Time: PM 5:39
 */
import kafka.producer.Partitioner;
import kafka.utils.VerifiableProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The type Single partition.
 */
public class SinglePartition implements Partitioner<String> {
    // - [ constant fields ] ----------------------------------------

    /**
     * The constant LOGGER.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(SinglePartition.class);

    // - [ variable fields ] ----------------------------------------
    // - [ constructor methods ] ------------------------------------

    /**
     * Instantiates a new Single partition.
     *
     * @param props the props
     */
    public SinglePartition(VerifiableProperties props) {
    }

    // - [ interface methods ] ------------------------------------

    /**
     * choose only one partition.
     *
     * @param key partition key
     * @param numberOfPartions number of partitions
     * @return the int
     */
    @Override
    public int partition(String key, int numberOfPartions) {
        return 0;
    }

    // - [ protected methods ] --------------------------------------
    // - [ public methods ] -----------------------------------------
    // - [ private methods ] ----------------------------------------
    // - [ static methods ] -----------------------------------------
    // - [ getter/setter methods ] ----------------------------------
    // - [ main methods ] -------------------------------------------
}
