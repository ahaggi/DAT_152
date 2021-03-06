"use strict";

/**
 * <p>Object with configurations. Currently, the only parameter is the URL of Mservices.</p>
 * 
 * @author Bjarte Kileng
 */
var config = {
    /**
     * <p>The top URL of the services of Mservices, relative to the application. The services will be:</p>
     * <ul>
     * <li>GET `${config.servicesPath}/updates/${loggId}`</li>
     * <li>DELETE `${config.servicesPath}/member/${memberId}`</li>
     * <li>POST `${config.servicesPath}/member/`</li>
     * <li>PUT `${config.servicesPath}/member/${memberId}`</li>
     * </ul>
     * 
     * @readonly
     * @type {String}
     */
    servicesPath: '../Mservices/data'  
}