using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Lexi.Lexi.Element;

namespace Lexi.Lexi.Check
{
    public abstract class Iterator
    {
    public abstract   Glyph First();
    public abstract Glyph Next();
    public abstract bool isDone();
    public abstract Glyph CurrentItem();
    }
}
