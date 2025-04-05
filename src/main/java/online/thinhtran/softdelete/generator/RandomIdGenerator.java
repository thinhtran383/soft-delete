package online.thinhtran.softdelete.generator;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

import java.io.Serializable;
import java.util.Random;

public class RandomIdGenerator extends SequenceStyleGenerator {
    @Override
    public Object generate(SharedSessionContractImplementor session, Object owner) throws HibernateException {
        return new Random().nextInt(1_000_000);
    }

    @Override
    public boolean allowAssignedIdentifiers() {
        return true;
    }

}
