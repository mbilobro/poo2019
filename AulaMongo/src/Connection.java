
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mbilo
 */
public class Connection {

    DB BasedeDados;
    DBCollection colecao;
    BasicDBObject documento = new BasicDBObject();

    public Connection() {
        Mongo mongo;
        try {
            mongo = new Mongo("localhost", 27017);
            BasedeDados = mongo.getDB("AulaMongo");
            colecao = BasedeDados.getCollection("Aluno");
            System.out.println("Conexão realizada com sucesso!!\n");
        } catch (UnknownHostException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        {

        }

    }

    public boolean inserir(Double dado) {
        documento.put("Entrada", dado);
        colecao.insert(documento);
        return true;
    }

    public void mostrar() {
        DBCursor cursor = colecao.find();
        while (cursor.hasNext()) {
            System.out.println(cursor.next());
        }
    }

    public boolean atualizar(Double DadoAntigo, Double DadoNovo) {
        documento.put("Entrada", DadoAntigo);
        BasicDBObject DocNovo = new BasicDBObject();
        DocNovo.put("Entrada", DadoNovo);
        colecao.findAndModify(documento, DocNovo);
        return true;
    }

    public boolean remover(Double dado) {
        documento.put("Entrada", dado);
        colecao.remove(documento);
        return true;
    }
}
