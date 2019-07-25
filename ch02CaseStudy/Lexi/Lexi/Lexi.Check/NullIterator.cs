using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Lexi.Lexi.Element;

namespace Lexi.Lexi.Check
{
    public class NullIterator : Iterator
    {

        public override Glyph First()
        { return new Glyph(); }
        public override Glyph Next()
        { return new Glyph(); }
        public override bool isDone()
        { return true; }
        public override Glyph CurrentItem()
        { return new Glyph(); }
    }
}
