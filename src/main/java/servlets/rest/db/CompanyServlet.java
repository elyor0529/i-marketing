package servlets.rest.db;

import db.CompaniesEntity;
import db.UsersEntity;
import manager.CompanyManager;
import manager.UserManager;
import servlets.rest.RestServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by elyor on 8/9/2015.
 */
public class CompanyServlet extends RestServlet<CompaniesEntity> {

    public CompanyServlet() {
        super(new CompanyManager());
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doDelete(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp);
    }

}
