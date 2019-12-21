import za.co.fnb.nav.car.core.services.CustomerService;

module nav.impl {
    requires nav.core;
    provides za.co.fnb.nav.car.core.services.CustomerService with za.co.fnb.nav.impl.services.CustomerServiceImpl;
}