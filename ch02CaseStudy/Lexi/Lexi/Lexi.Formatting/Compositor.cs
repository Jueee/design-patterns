using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Lexi.Lexi.Element;

namespace Lexi.Lexi.Formatting
{
    public class Compositor
    {
        protected Composition _Composition;
        public void SetComposition(Composition composition)
        {
            _Composition = composition;
        }
        public virtual void Compose()
        { }
    }
}
