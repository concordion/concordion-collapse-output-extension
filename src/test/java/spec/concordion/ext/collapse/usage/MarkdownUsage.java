package spec.concordion.ext.collapse.usage;

import org.concordion.api.extension.Extensions;
import org.concordion.api.option.ConcordionOptions;
import org.concordion.ext.collapse.CollapseOutputExtension;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.Before;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
@Extensions(CollapseOutputExtension.class)
public class MarkdownUsage {
    public boolean returnTrue() {
        return true;
    }
}
