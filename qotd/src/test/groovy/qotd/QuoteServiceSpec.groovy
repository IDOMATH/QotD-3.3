package qotd

import grails.testing.services.ServiceUnitTest
import spock.lang.Specification

class QuoteServiceSpec extends Specification implements ServiceUnitTest<QuoteService>
{
    void "static quote service always returns quiche quote"()
    {
        when:
        Quote staticQuote = service.getStaticQuote()

        then:
        staticQuote.author == "Anonymous"
        staticQuote.content == "Real Programmers Don't eat much Quiche"
    }

    def setup()
    {
    }

    def cleanup()
    {
    }

    void "test something"()
    {
        expect:"fix me"
            true == false
    }
}
