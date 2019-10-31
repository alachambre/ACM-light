package com.company.dispute.resolution

interface BPMNameConstants {

    def static final DISPUTE_PROCESS_NAME = 'CreditCardDisputeResolution'

    def static final ACTIVITY_CONTAINER = 'Dynamic Activity Container'
    def static final CREATE_ACTIVITY = 'Create Activity'
    def static final CLOSE_ACTIVITY = 'Close'
    def static final HIDDEN_ACTIVITIES = [
        ACTIVITY_CONTAINER,
        CREATE_ACTIVITY,
        CLOSE_ACTIVITY
    ]
    def static final ACTIVITY_STATE_DATA_NAME = '$acmState'

    def static final REQUIRED_STATE = 'Required'
    def static final OPTIONAL_STATE = 'Optional'
    def static final DISCRETIONARY_STATE = 'Discretionary'
    def static final NOT_AVAILABLE_STATE = 'N/A'
}