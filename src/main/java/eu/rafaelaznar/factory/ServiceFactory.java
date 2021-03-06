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

import eu.rafaelaznar.bean.helper.ReplyBeanHelper;
import eu.rafaelaznar.helper.EncodingHelper;
import eu.rafaelaznar.service.specificimplementation.CentroSpecificServiceImplementation;
import eu.rafaelaznar.service.specificimplementation.CentrosanitarioSpecificServiceImplementation;
import eu.rafaelaznar.service.specificimplementation.CursoSpecificServiceImplementation;
import eu.rafaelaznar.service.specificimplementation.GrupoSpecificServiceImplementation;
import eu.rafaelaznar.service.specificimplementation.SexoSpecificServiceImplementation;
import eu.rafaelaznar.service.specificimplementation.TipousuarioSpecificServiceImplementation;
import eu.rafaelaznar.service.specificimplementation.UsuarioSpecificServiceImplementation;
import javax.servlet.http.HttpServletRequest;

public class ServiceFactory {

    public static ReplyBeanHelper executeMethodService(HttpServletRequest oRequest) throws Exception {
        String ob = oRequest.getParameter("ob");
        String op = oRequest.getParameter("op");
        ReplyBeanHelper oReplyBean = null;
        switch (ob) {
            case "usuario":
                UsuarioSpecificServiceImplementation oUsuarioService = new UsuarioSpecificServiceImplementation(oRequest);
                switch (op) {

                    case "getallobjectsmetadata":
                        oReplyBean = oUsuarioService.getallobjectsmetadata();
                        break;
                    case "getmetadata":
                        oReplyBean = oUsuarioService.getMetaData();
                        break;
                    case "getobjectmetadata":
                        oReplyBean = oUsuarioService.getObjectMetaData();
                        break;
                    case "getpropertiesmetadata":
                        oReplyBean = oUsuarioService.getPropertiesMetaData();
                        break;
                    case "get":
                        oReplyBean = oUsuarioService.get();
                        break;
                    case "set":
                        oReplyBean = oUsuarioService.set();
                        break;
                    case "remove":
                        oReplyBean = oUsuarioService.remove();
                        break;
                    case "getpage":
                        oReplyBean = oUsuarioService.getPage();
                        break;
                    case "getcount":
                        oReplyBean = oUsuarioService.getCount();
                        break;
                    case "login":
                        oReplyBean = oUsuarioService.login();
                        break;
                    case "logout":
                        oReplyBean = oUsuarioService.logout();
                        break;
                    case "getsessionstatus":
                        oReplyBean = oUsuarioService.getSessionStatus();
                        break;
                    case "getcountx":
                        oReplyBean = oUsuarioService.getCountX();
                        break;
                    case "getpagex":
                        oReplyBean = oUsuarioService.getPageX();
                        break;
                    case "setpass":
                        oReplyBean = oUsuarioService.setPass();
                        break;
                    case "getsessionuserlevel":
                        oReplyBean = oUsuarioService.getSessionUserLevel();
                        break;
                    default:
                        oReplyBean = new ReplyBeanHelper(500, EncodingHelper.quotate("Operation not found : Please contact your administrator"));
                        break;
                }
                break;
            case "tipousuario":
                TipousuarioSpecificServiceImplementation oTipousuarioService = new TipousuarioSpecificServiceImplementation(oRequest);
                switch (op) {
                    case "getmetadata":
                        oReplyBean = oTipousuarioService.getMetaData();
                        break;
                    case "getobjectmetadata":
                        oReplyBean = oTipousuarioService.getObjectMetaData();
                        break;
                    case "getpropertiesmetadata":
                        oReplyBean = oTipousuarioService.getPropertiesMetaData();
                        break;
                    case "get":
                        oReplyBean = oTipousuarioService.get();
                        break;
                    case "set":
                        oReplyBean = oTipousuarioService.set();
                        break;
                    case "remove":
                        oReplyBean = oTipousuarioService.remove();
                        break;
                    case "getpage":
                        oReplyBean = oTipousuarioService.getPage();
                        break;
                    case "getcount":
                        oReplyBean = oTipousuarioService.getCount();
                        break;
                    default:
                        oReplyBean = new ReplyBeanHelper(500, EncodingHelper.quotate("Operation not found : Please contact your administrator"));
                        break;
                }
                break;
            case "grupo":
                GrupoSpecificServiceImplementation oGrupoService = new GrupoSpecificServiceImplementation(oRequest);
                switch (op) {
                    case "check":
                        oReplyBean = oGrupoService.check();
                        break;
                    case "getmetadata":
                        oReplyBean = oGrupoService.getMetaData();
                        break;
                    case "getobjectmetadata":
                        oReplyBean = oGrupoService.getObjectMetaData();
                        break;
                    case "getpropertiesmetadata":
                        oReplyBean = oGrupoService.getPropertiesMetaData();
                        break;
                    case "get":
                        oReplyBean = oGrupoService.get();
                        break;
                    case "set":
                        oReplyBean = oGrupoService.set();
                        break;
                    case "remove":
                        oReplyBean = oGrupoService.remove();
                        break;
                    case "getpage":
                        oReplyBean = oGrupoService.getPage();
                        break;
                    case "getcount":
                        oReplyBean = oGrupoService.getCount();
                        break;
                    case "getcountx":
                        oReplyBean = oGrupoService.getCountX();
                        break;
                    case "getpagex":
                        oReplyBean = oGrupoService.getPageX();
                        break;
                    default:
                        oReplyBean = new ReplyBeanHelper(500, EncodingHelper.quotate("Operation not found : Please contact your administrator"));
                        break;
                }
                break;
            case "curso":
                CursoSpecificServiceImplementation oCursoService = new CursoSpecificServiceImplementation(oRequest);
                switch (op) {
                    case "getmetadata":
                        oReplyBean = oCursoService.getMetaData();
                        break;
                    case "getobjectmetadata":
                        oReplyBean = oCursoService.getObjectMetaData();
                        break;
                    case "getpropertiesmetadata":
                        oReplyBean = oCursoService.getPropertiesMetaData();
                        break;
                    case "get":
                        oReplyBean = oCursoService.get();
                        break;
                    case "set":
                        oReplyBean = oCursoService.set();
                        break;
                    case "remove":
                        oReplyBean = oCursoService.remove();
                        break;
                    case "getpage":
                        oReplyBean = oCursoService.getPage();
                        break;
                    case "getcount":
                        oReplyBean = oCursoService.getCount();
                        break;
                    case "getcountx":
                        oReplyBean = oCursoService.getCountX();
                        break;
                    case "getpagex":
                        oReplyBean = oCursoService.getPageX();
                        break;
                    default:
                        oReplyBean = new ReplyBeanHelper(500, EncodingHelper.quotate("Operation not found : Please contact your administrator"));
                        break;
                }
                break;
            case "centrosanitario":
                CentrosanitarioSpecificServiceImplementation oCentrosanitarioService = new CentrosanitarioSpecificServiceImplementation(oRequest);
                switch (op) {
                    case "getmetadata":
                        oReplyBean = oCentrosanitarioService.getMetaData();
                        break;
                    case "getobjectmetadata":
                        oReplyBean = oCentrosanitarioService.getObjectMetaData();
                        break;
                    case "getpropertiesmetadata":
                        oReplyBean = oCentrosanitarioService.getPropertiesMetaData();
                        break;
                    case "get":
                        oReplyBean = oCentrosanitarioService.get();
                        break;
                    case "set":
                        oReplyBean = oCentrosanitarioService.set();
                        break;
                    case "remove":
                        oReplyBean = oCentrosanitarioService.remove();
                        break;
                    case "getpage":
                        oReplyBean = oCentrosanitarioService.getPage();
                        break;
                    case "getcount":
                        oReplyBean = oCentrosanitarioService.getCount();
                        break;
                    case "getcountx":
                        oReplyBean = oCentrosanitarioService.getCountX();
                        break;
                    case "getpagex":
                        oReplyBean = oCentrosanitarioService.getPageX();
                        break;
                    default:
                        oReplyBean = new ReplyBeanHelper(500, EncodingHelper.quotate("Operation not found : Please contact your administrator"));
                        break;
                }
                break;
            case "centro":
                CentroSpecificServiceImplementation oCentroService = new CentroSpecificServiceImplementation(oRequest);
                switch (op) {
                    case "getmetadata":
                        oReplyBean = oCentroService.getMetaData();
                        break;
                    case "getobjectmetadata":
                        oReplyBean = oCentroService.getObjectMetaData();
                        break;
                    case "getpropertiesmetadata":
                        oReplyBean = oCentroService.getPropertiesMetaData();
                        break;
                    case "get":
                        oReplyBean = oCentroService.get();
                        break;
                    case "set":
                        oReplyBean = oCentroService.set();
                        break;
                    case "remove":
                        oReplyBean = oCentroService.remove();
                        break;
                    case "getpage":
                        oReplyBean = oCentroService.getPage();
                        break;
                    case "getcount":
                        oReplyBean = oCentroService.getCount();
                        break;
                    case "getcountx":
                        oReplyBean = oCentroService.getCountX();
                        break;
                    case "getpagex":
                        oReplyBean = oCentroService.getPageX();
                        break;
                    default:
                        oReplyBean = new ReplyBeanHelper(500, EncodingHelper.quotate("Operation not found : Please contact your administrator"));
                        break;
                }
                break;
            case "sexo":
                SexoSpecificServiceImplementation oSexoService = new SexoSpecificServiceImplementation(oRequest);
                switch (op) {
                    case "getmetadata":
                        oReplyBean = oSexoService.getMetaData();
                        break;
                    case "getobjectmetadata":
                        oReplyBean = oSexoService.getObjectMetaData();
                        break;
                    case "getpropertiesmetadata":
                        oReplyBean = oSexoService.getPropertiesMetaData();
                        break;
                    case "get":
                        oReplyBean = oSexoService.get();
                        break;
                    case "set":
                        oReplyBean = oSexoService.set();
                        break;
                    case "remove":
                        oReplyBean = oSexoService.remove();
                        break;
                    case "getpage":
                        oReplyBean = oSexoService.getPage();
                        break;
                    case "getcount":
                        oReplyBean = oSexoService.getCount();
                        break;
                    case "getcountx":
                        oReplyBean = oSexoService.getCountX();
                        break;
                    case "getpagex":
                        oReplyBean = oSexoService.getPageX();
                        break;
                    default:
                        oReplyBean = new ReplyBeanHelper(500, EncodingHelper.quotate("Operation not found : Please contact your administrator"));
                        break;
                }
                break;

            default:
                oReplyBean = new ReplyBeanHelper(500, EncodingHelper.quotate("Object not found : Please contact your administrator"));
                break;
        }
        return oReplyBean;
    }
}
