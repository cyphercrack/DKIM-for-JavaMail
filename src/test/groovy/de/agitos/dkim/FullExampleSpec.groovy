package de.agitos.dkim

import spock.lang.Specification



class FullExampleSpec extends Specification {

    def "send full mail"(){
        given:
            DKIMSigner signer = new DKIMSigner( "mydomain.com", "default", "src/test/fixtures/keys/private.key.der" )
        when:
            signer
        then:
            signer

    }

}