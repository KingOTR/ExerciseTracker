package org.mapsforge.map.rendertheme.rule;

import androidx.autofill.HintConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.mapsforge.core.model.Tag;
import org.mapsforge.core.util.LRUCache;
import org.mapsforge.core.util.Utils;
import org.mapsforge.map.datastore.PointOfInterest;
import org.mapsforge.map.layer.renderer.PolylineContainer;
import org.mapsforge.map.layer.renderer.StandardRenderer;
import org.mapsforge.map.model.DisplayModel;
import org.mapsforge.map.rendertheme.RenderCallback;
import org.mapsforge.map.rendertheme.RenderContext;
import org.mapsforge.map.rendertheme.renderinstruction.Hillshading;
import org.mapsforge.map.rendertheme.renderinstruction.RenderInstruction;
import org.mapsforge.map.rendertheme.rule.Rule;

/* loaded from: classes5.dex */
public class RenderTheme {
    private static final int MATCHING_CACHE_SIZE = 8192;
    private static final int keyCodeName = Utils.hashTagParameter(HintConstants.AUTOFILL_HINT_NAME);
    private final float baseStrokeWidth;
    private final float baseTextSize;
    private final boolean hasBackgroundOutside;
    private int levels;
    private final int mapBackground;
    private final int mapBackgroundOutside;
    private ArrayList<Hillshading> hillShadings = new ArrayList<>();
    private final Map<Byte, Float> strokeScales = new HashMap();
    private final Map<Byte, Float> textScales = new HashMap();
    private final ArrayList<Rule> rulesList = new ArrayList<>();
    private final LRUCache<Integer, RenderInstruction[]> poiMatchingCache = new LRUCache<>(8192);
    private final LRUCache<Integer, RenderInstruction[]> wayMatchingCache = new LRUCache<>(8192);

    RenderTheme(RenderThemeBuilder renderThemeBuilder) {
        this.baseStrokeWidth = renderThemeBuilder.baseStrokeWidth;
        this.baseTextSize = renderThemeBuilder.baseTextSize;
        this.hasBackgroundOutside = renderThemeBuilder.hasBackgroundOutside;
        this.mapBackground = renderThemeBuilder.mapBackground;
        this.mapBackgroundOutside = renderThemeBuilder.mapBackgroundOutside;
    }

    public void destroy() {
        this.poiMatchingCache.clear();
        this.wayMatchingCache.clear();
        Iterator<Rule> it = this.rulesList.iterator();
        while (it.hasNext()) {
            it.next().destroy();
        }
    }

    public int getLevels() {
        return this.levels;
    }

    public int getMapBackground() {
        return this.mapBackground;
    }

    public int getMapBackgroundOutside() {
        return this.mapBackgroundOutside;
    }

    public boolean hasMapBackgroundOutside() {
        return this.hasBackgroundOutside;
    }

    public void matchClosedWay(RenderCallback renderCallback, RenderContext renderContext, PolylineContainer polylineContainer) {
        matchWay(renderCallback, renderContext, Closed.YES, polylineContainer);
    }

    public void matchLinearWay(RenderCallback renderCallback, RenderContext renderContext, PolylineContainer polylineContainer) {
        matchWay(renderCallback, renderContext, Closed.NO, polylineContainer);
    }

    public synchronized void matchNode(RenderCallback renderCallback, RenderContext renderContext, PointOfInterest pointOfInterest) {
        int intValue = computeMatchingCacheKey(pointOfInterest.tags, renderContext.rendererJob.tile.zoomLevel, Closed.NO).intValue();
        RenderInstruction[] renderInstructionArr = this.poiMatchingCache.get(Integer.valueOf(intValue));
        int i = 0;
        if (renderInstructionArr != null) {
            while (i < renderInstructionArr.length) {
                renderInstructionArr[i].renderNode(renderCallback, renderContext, pointOfInterest);
                i++;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        int size = this.rulesList.size();
        while (i < size) {
            this.rulesList.get(i).matchNode(renderCallback, renderContext, arrayList, pointOfInterest);
            i++;
        }
        RenderInstruction[] renderInstructionArr2 = new RenderInstruction[arrayList.size()];
        arrayList.toArray(renderInstructionArr2);
        this.poiMatchingCache.put(Integer.valueOf(intValue), renderInstructionArr2);
    }

    public synchronized void scaleStrokeWidth(float f, byte b) {
        if (!this.strokeScales.containsKey(Byte.valueOf(b)) || f != this.strokeScales.get(Byte.valueOf(b)).floatValue()) {
            int size = this.rulesList.size();
            for (int i = 0; i < size; i++) {
                Rule rule = this.rulesList.get(i);
                if (rule.zoomMin <= b && rule.zoomMax >= b) {
                    rule.scaleStrokeWidth(this.baseStrokeWidth * f * DisplayModel.lineScale, b);
                }
            }
            this.strokeScales.put(Byte.valueOf(b), Float.valueOf(f));
        }
    }

    public synchronized void scaleTextSize(float f, byte b) {
        if (!this.textScales.containsKey(Byte.valueOf(b)) || f != this.textScales.get(Byte.valueOf(b)).floatValue()) {
            int size = this.rulesList.size();
            for (int i = 0; i < size; i++) {
                Rule rule = this.rulesList.get(i);
                if (rule.zoomMin <= b && rule.zoomMax >= b) {
                    rule.scaleTextSize(this.baseTextSize * f * DisplayModel.textScale, b);
                }
            }
            this.textScales.put(Byte.valueOf(b), Float.valueOf(f));
        }
    }

    void addRule(Rule rule) {
        this.rulesList.add(rule);
    }

    void addHillShadings(Hillshading hillshading) {
        this.hillShadings.add(hillshading);
    }

    void complete() {
        this.rulesList.trimToSize();
        this.hillShadings.trimToSize();
        int size = this.rulesList.size();
        for (int i = 0; i < size; i++) {
            this.rulesList.get(i).onComplete();
        }
    }

    void setLevels(int i) {
        this.levels = i;
    }

    private synchronized void matchWay(RenderCallback renderCallback, RenderContext renderContext, Closed closed, PolylineContainer polylineContainer) {
        int intValue = computeMatchingCacheKey(polylineContainer.getTags(), polylineContainer.getUpperLeft().zoomLevel, closed).intValue();
        RenderInstruction[] renderInstructionArr = this.wayMatchingCache.get(Integer.valueOf(intValue));
        if (renderInstructionArr != null) {
            for (RenderInstruction renderInstruction : renderInstructionArr) {
                renderInstruction.renderWay(renderCallback, renderContext, polylineContainer);
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        int size = this.rulesList.size();
        for (int i = 0; i < size; i++) {
            this.rulesList.get(i).matchWay(renderCallback, polylineContainer, polylineContainer.getUpperLeft(), closed, arrayList, renderContext);
        }
        RenderInstruction[] renderInstructionArr2 = new RenderInstruction[arrayList.size()];
        arrayList.toArray(renderInstructionArr2);
        this.wayMatchingCache.put(Integer.valueOf(intValue), renderInstructionArr2);
    }

    public void traverseRules(Rule.RuleVisitor ruleVisitor) {
        Iterator<Rule> it = this.rulesList.iterator();
        while (it.hasNext()) {
            it.next().apply(ruleVisitor);
        }
    }

    public void matchHillShadings(StandardRenderer standardRenderer, RenderContext renderContext) {
        Iterator<Hillshading> it = this.hillShadings.iterator();
        while (it.hasNext()) {
            it.next().render(renderContext, standardRenderer.hillsRenderConfig);
        }
    }

    private Integer computeMatchingCacheKey(List<Tag> list, byte b, Closed closed) {
        int hashCode = (closed == null ? 0 : closed.hashCode()) + 31;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Tag tag = list.get(i);
                if (keyCodeName != tag.keyCode) {
                    hashCode = (hashCode * 31) + tag.hashCode();
                }
            }
        }
        return Integer.valueOf((hashCode * 31) + b);
    }
}
