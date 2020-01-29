package org.openmined.syft.interfaces

interface SignallingInterface {

    /**
     * Called in the UI activity as a response to message received from PyGrid
     * Runs on the thread generated by calleeThreadScheduler
     * @param message : message to be sent
     */
    fun onMessage(message: String)

    /**
     * Called in the UI activity when connection to PyGrid closes
     * Runs on the thread generated by calleeThreadScheduler
     */
    fun onClose()

    /**
     * Called in the UI activity when connection to PyGrid is established
     * Runs on the thread generated by calleeThreadScheduler
     */
    fun onOpen()
}