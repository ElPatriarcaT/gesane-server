/*
 * Copyright (c) 2017 by Rafael Angel Aznar Aparici (rafaaznar at gmail dot com)
 * 
 * trolleyes-server3: Helps you to develop easily AJAX web applications 
 *               by copying and modifying this Java Server.
 *
 * Sources at https://github.com/rafaelaznar/trolleyes-server3
 * 
 * trolleyes-server3 is distributed under the MIT License (MIT)
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package eu.rafaelaznar.factory;

import eu.rafaelaznar.bean.helper.MetaBeanHelper;
import eu.rafaelaznar.dao.publicinterface.MetaDaoInterface;
import eu.rafaelaznar.dao.specificimplementation.CentroSpecificDaoImplementation;
import eu.rafaelaznar.dao.specificimplementation.CentrosanitarioSpecificDaoImplementation;
import eu.rafaelaznar.dao.specificimplementation.CursoSpecificDaoImplementation;
import eu.rafaelaznar.dao.specificimplementation.GrupoSpecificDaoImplementation;
import eu.rafaelaznar.dao.specificimplementation.SexoSpecificDaoImplementation;
import eu.rafaelaznar.dao.specificimplementation.TipousuarioSpecificDaoImplementation;
import eu.rafaelaznar.dao.specificimplementation.UsuarioSpecificDaoImplementation;
import java.sql.Connection;

public class DaoFactory {

    public static MetaDaoInterface getDao(String ob, Connection oConnection, MetaBeanHelper oPuserBean_security, String strWhere) throws Exception {
        MetaDaoInterface oDao = null;

        switch (ob) {
            case "usuario":
                oDao = (MetaDaoInterface) new UsuarioSpecificDaoImplementation(oConnection, oPuserBean_security, strWhere);
                break;
            case "tipousuario":
                oDao = (MetaDaoInterface) new TipousuarioSpecificDaoImplementation(oConnection, oPuserBean_security, strWhere);
                break;
            case "grupo":
                oDao = (MetaDaoInterface) new GrupoSpecificDaoImplementation(oConnection, oPuserBean_security, strWhere);
                break;
            case "curso":
                oDao = (MetaDaoInterface) new CursoSpecificDaoImplementation(oConnection, oPuserBean_security, strWhere);
                break;
            case "centrosanitario":
                oDao = (MetaDaoInterface) new CentrosanitarioSpecificDaoImplementation(oConnection, oPuserBean_security, strWhere);
                break;
            case "centro":
                oDao = (MetaDaoInterface) new CentroSpecificDaoImplementation(oConnection, oPuserBean_security, strWhere);
                break;
            case "sexo":
                oDao = (MetaDaoInterface) new SexoSpecificDaoImplementation(oConnection, oPuserBean_security, strWhere);
                break;
            default:
                //oReplyBean = new ReplyBean(500, "Object not found : Please contact your administrator");
                break;
        }
        return oDao;
    }

}
