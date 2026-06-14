package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Synagogue.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Synagogue", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getSynagogue", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_synagogue", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SynagogueKt {
    private static ImageVector _synagogue;

    public static final ImageVector getSynagogue(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _synagogue;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Synagogue", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.0f, 54.34f);
        pathBuilder.lineTo(208.0f, 32.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f);
        pathBuilder.lineTo(184.0f, 54.34f);
        pathBuilder.arcTo(32.06f, 32.06f, 0.0f, false, false, 164.0f, 84.0f);
        pathBuilder.verticalLineToRelative(26.75f);
        pathBuilder.lineTo(140.0f, 97.0f);
        pathBuilder.lineTo(140.0f, 72.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f);
        pathBuilder.lineTo(116.0f, 97.0f);
        pathBuilder.lineTo(92.0f, 110.75f);
        pathBuilder.lineTo(92.0f, 84.0f);
        pathBuilder.arcTo(32.06f, 32.06f, 0.0f, false, false, 72.0f, 54.34f);
        pathBuilder.lineTo(72.0f, 32.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f);
        pathBuilder.lineTo(48.0f, 54.34f);
        pathBuilder.arcTo(32.06f, 32.06f, 0.0f, false, false, 28.0f, 84.0f);
        pathBuilder.lineTo(28.0f, 216.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f);
        pathBuilder.lineTo(216.0f, 228.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f);
        pathBuilder.lineTo(228.0f, 84.0f);
        pathBuilder.arcTo(32.06f, 32.06f, 0.0f, false, false, 208.0f, 54.34f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 160.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.lineTo(92.0f, 204.0f);
        pathBuilder.lineTo(92.0f, 138.39f);
        pathBuilder.lineToRelative(36.0f, -20.57f);
        pathBuilder.lineToRelative(36.0f, 20.57f);
        pathBuilder.lineTo(164.0f, 204.0f);
        pathBuilder.lineTo(140.0f, 204.0f);
        pathBuilder.lineTo(140.0f, 172.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 128.0f, 160.0f);
        pathBuilder.close();
        pathBuilder.moveTo(52.0f, 84.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.lineTo(52.0f, 100.0f);
        pathBuilder.close();
        pathBuilder.moveTo(188.0f, 84.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.lineTo(188.0f, 100.0f);
        pathBuilder.close();
        pathBuilder.moveTo(52.0f, 124.0f);
        pathBuilder.lineTo(68.0f, 124.0f);
        pathBuilder.verticalLineToRelative(80.0f);
        pathBuilder.lineTo(52.0f, 204.0f);
        pathBuilder.close();
        pathBuilder.moveTo(188.0f, 204.0f);
        pathBuilder.lineTo(188.0f, 124.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.verticalLineToRelative(80.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _synagogue = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
